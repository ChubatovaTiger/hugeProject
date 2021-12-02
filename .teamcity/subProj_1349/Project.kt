package subProj_1349

import subProj_1349.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1349")
    name = "subProj 1349"

    buildType(subProj_bt_1349_5)
    buildType(subProj_bt_1349_4)
    buildType(subProj_bt_1349_3)
    buildType(subProj_bt_1349_2)
    buildType(subProj_bt_1349_1)
    buildType(subProj_bt_1349_0)
})
