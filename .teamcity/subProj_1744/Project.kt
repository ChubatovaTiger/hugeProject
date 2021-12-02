package subProj_1744

import subProj_1744.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1744")
    name = "subProj 1744"

    buildType(subProj_bt_1744_3)
    buildType(subProj_bt_1744_2)
    buildType(subProj_bt_1744_1)
    buildType(subProj_bt_1744_0)
    buildType(subProj_bt_1744_5)
    buildType(subProj_bt_1744_4)
})
