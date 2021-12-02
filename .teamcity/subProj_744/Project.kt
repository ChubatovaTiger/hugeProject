package subProj_744

import subProj_744.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_744")
    name = "subProj 744"

    buildType(subProj_bt_744_5)
    buildType(subProj_bt_744_1)
    buildType(subProj_bt_744_2)
    buildType(subProj_bt_744_3)
    buildType(subProj_bt_744_4)
    buildType(subProj_bt_744_0)
})
