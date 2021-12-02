package subProj_749

import subProj_749.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_749")
    name = "subProj 749"

    buildType(subProj_bt_749_4)
    buildType(subProj_bt_749_5)
    buildType(subProj_bt_749_0)
    buildType(subProj_bt_749_1)
    buildType(subProj_bt_749_2)
    buildType(subProj_bt_749_3)
})
