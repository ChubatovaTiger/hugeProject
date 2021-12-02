package subProj_881

import subProj_881.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_881")
    name = "subProj 881"

    buildType(subProj_bt_881_0)
    buildType(subProj_bt_881_1)
    buildType(subProj_bt_881_2)
    buildType(subProj_bt_881_3)
    buildType(subProj_bt_881_4)
    buildType(subProj_bt_881_5)
})
