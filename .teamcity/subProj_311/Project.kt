package subProj_311

import subProj_311.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_311")
    name = "subProj 311"

    buildType(subProj_bt_311_3)
    buildType(subProj_bt_311_4)
    buildType(subProj_bt_311_1)
    buildType(subProj_bt_311_2)
    buildType(subProj_bt_311_5)
    buildType(subProj_bt_311_0)
})
