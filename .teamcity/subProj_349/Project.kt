package subProj_349

import subProj_349.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_349")
    name = "subProj 349"

    buildType(subProj_bt_349_0)
    buildType(subProj_bt_349_1)
    buildType(subProj_bt_349_2)
    buildType(subProj_bt_349_3)
    buildType(subProj_bt_349_4)
    buildType(subProj_bt_349_5)
})
