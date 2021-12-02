package subProj_491

import subProj_491.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_491")
    name = "subProj 491"

    buildType(subProj_bt_491_4)
    buildType(subProj_bt_491_5)
    buildType(subProj_bt_491_0)
    buildType(subProj_bt_491_1)
    buildType(subProj_bt_491_2)
    buildType(subProj_bt_491_3)
})
