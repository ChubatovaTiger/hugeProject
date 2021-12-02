package subProj_996

import subProj_996.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_996")
    name = "subProj 996"

    buildType(subProj_bt_996_0)
    buildType(subProj_bt_996_1)
    buildType(subProj_bt_996_4)
    buildType(subProj_bt_996_5)
    buildType(subProj_bt_996_2)
    buildType(subProj_bt_996_3)
})
