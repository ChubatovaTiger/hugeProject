package subProj_1252

import subProj_1252.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1252")
    name = "subProj 1252"

    buildType(subProj_bt_1252_5)
    buildType(subProj_bt_1252_4)
    buildType(subProj_bt_1252_1)
    buildType(subProj_bt_1252_0)
    buildType(subProj_bt_1252_3)
    buildType(subProj_bt_1252_2)
})
