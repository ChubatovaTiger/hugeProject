package subProj_1996

import subProj_1996.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1996")
    name = "subProj 1996"

    buildType(subProj_bt_1996_2)
    buildType(subProj_bt_1996_1)
    buildType(subProj_bt_1996_4)
    buildType(subProj_bt_1996_3)
    buildType(subProj_bt_1996_0)
    buildType(subProj_bt_1996_5)
})
