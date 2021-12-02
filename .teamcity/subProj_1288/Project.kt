package subProj_1288

import subProj_1288.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1288")
    name = "subProj 1288"

    buildType(subProj_bt_1288_3)
    buildType(subProj_bt_1288_4)
    buildType(subProj_bt_1288_1)
    buildType(subProj_bt_1288_2)
    buildType(subProj_bt_1288_5)
    buildType(subProj_bt_1288_0)
})
