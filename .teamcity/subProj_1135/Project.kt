package subProj_1135

import subProj_1135.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1135")
    name = "subProj 1135"

    buildType(subProj_bt_1135_2)
    buildType(subProj_bt_1135_3)
    buildType(subProj_bt_1135_0)
    buildType(subProj_bt_1135_1)
    buildType(subProj_bt_1135_4)
    buildType(subProj_bt_1135_5)
})
