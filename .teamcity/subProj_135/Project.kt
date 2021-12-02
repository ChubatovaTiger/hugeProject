package subProj_135

import subProj_135.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_135")
    name = "subProj 135"

    buildType(subProj_bt_135_5)
    buildType(subProj_bt_135_4)
    buildType(subProj_bt_135_3)
    buildType(subProj_bt_135_2)
    buildType(subProj_bt_135_1)
    buildType(subProj_bt_135_0)
})
