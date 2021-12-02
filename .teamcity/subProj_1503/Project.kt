package subProj_1503

import subProj_1503.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1503")
    name = "subProj 1503"

    buildType(subProj_bt_1503_4)
    buildType(subProj_bt_1503_3)
    buildType(subProj_bt_1503_5)
    buildType(subProj_bt_1503_0)
    buildType(subProj_bt_1503_2)
    buildType(subProj_bt_1503_1)
})
