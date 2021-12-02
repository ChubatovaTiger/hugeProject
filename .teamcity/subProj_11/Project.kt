package subProj_11

import subProj_11.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_11")
    name = "subProj 11"

    buildType(subProj_bt_11_5)
    buildType(subProj_bt_11_4)
    buildType(subProj_bt_11_3)
    buildType(subProj_bt_11_2)
    buildType(subProj_bt_11_1)
    buildType(subProj_bt_11_0)
})
