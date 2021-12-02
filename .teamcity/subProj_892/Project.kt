package subProj_892

import subProj_892.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_892")
    name = "subProj 892"

    buildType(subProj_bt_892_0)
    buildType(subProj_bt_892_1)
    buildType(subProj_bt_892_2)
    buildType(subProj_bt_892_3)
    buildType(subProj_bt_892_4)
    buildType(subProj_bt_892_5)
})
