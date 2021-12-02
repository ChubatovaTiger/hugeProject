package subProj_233

import subProj_233.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_233")
    name = "subProj 233"

    buildType(subProj_bt_233_3)
    buildType(subProj_bt_233_2)
    buildType(subProj_bt_233_5)
    buildType(subProj_bt_233_4)
    buildType(subProj_bt_233_1)
    buildType(subProj_bt_233_0)
})
