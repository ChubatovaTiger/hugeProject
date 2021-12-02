package subProj_1014

import subProj_1014.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1014")
    name = "subProj 1014"

    buildType(subProj_bt_1014_3)
    buildType(subProj_bt_1014_2)
    buildType(subProj_bt_1014_1)
    buildType(subProj_bt_1014_0)
    buildType(subProj_bt_1014_5)
    buildType(subProj_bt_1014_4)
})
