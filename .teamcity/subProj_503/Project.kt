package subProj_503

import subProj_503.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_503")
    name = "subProj 503"

    buildType(subProj_bt_503_4)
    buildType(subProj_bt_503_5)
    buildType(subProj_bt_503_2)
    buildType(subProj_bt_503_3)
    buildType(subProj_bt_503_0)
    buildType(subProj_bt_503_1)
})
