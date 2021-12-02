package subProj_441

import subProj_441.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_441")
    name = "subProj 441"

    buildType(subProj_bt_441_5)
    buildType(subProj_bt_441_3)
    buildType(subProj_bt_441_4)
    buildType(subProj_bt_441_1)
    buildType(subProj_bt_441_2)
    buildType(subProj_bt_441_0)
})
