package subProj_669

import subProj_669.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_669")
    name = "subProj 669"

    buildType(subProj_bt_669_5)
    buildType(subProj_bt_669_4)
    buildType(subProj_bt_669_3)
    buildType(subProj_bt_669_2)
    buildType(subProj_bt_669_1)
    buildType(subProj_bt_669_0)
})
