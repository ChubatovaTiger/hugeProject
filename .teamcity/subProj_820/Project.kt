package subProj_820

import subProj_820.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_820")
    name = "subProj 820"

    buildType(subProj_bt_820_1)
    buildType(subProj_bt_820_0)
    buildType(subProj_bt_820_3)
    buildType(subProj_bt_820_2)
    buildType(subProj_bt_820_5)
    buildType(subProj_bt_820_4)
})
