package subProj_530

import subProj_530.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_530")
    name = "subProj 530"

    buildType(subProj_bt_530_1)
    buildType(subProj_bt_530_0)
    buildType(subProj_bt_530_5)
    buildType(subProj_bt_530_4)
    buildType(subProj_bt_530_3)
    buildType(subProj_bt_530_2)
})
