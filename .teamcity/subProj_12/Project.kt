package subProj_12

import subProj_12.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_12")
    name = "subProj 12"

    buildType(subProj_bt_12_5)
    buildType(subProj_bt_12_4)
    buildType(subProj_bt_12_3)
    buildType(subProj_bt_12_2)
    buildType(subProj_bt_12_1)
    buildType(subProj_bt_12_0)
})
