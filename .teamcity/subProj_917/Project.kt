package subProj_917

import subProj_917.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_917")
    name = "subProj 917"

    buildType(subProj_bt_917_5)
    buildType(subProj_bt_917_4)
    buildType(subProj_bt_917_3)
    buildType(subProj_bt_917_2)
    buildType(subProj_bt_917_1)
    buildType(subProj_bt_917_0)
})
