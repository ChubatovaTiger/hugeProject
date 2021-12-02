package subProj_288

import subProj_288.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_288")
    name = "subProj 288"

    buildType(subProj_bt_288_5)
    buildType(subProj_bt_288_4)
    buildType(subProj_bt_288_3)
    buildType(subProj_bt_288_2)
    buildType(subProj_bt_288_1)
    buildType(subProj_bt_288_0)
})
