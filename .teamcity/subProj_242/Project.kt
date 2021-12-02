package subProj_242

import subProj_242.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_242")
    name = "subProj 242"

    buildType(subProj_bt_242_5)
    buildType(subProj_bt_242_4)
    buildType(subProj_bt_242_1)
    buildType(subProj_bt_242_0)
    buildType(subProj_bt_242_3)
    buildType(subProj_bt_242_2)
})
