package subProj_367

import subProj_367.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_367")
    name = "subProj 367"

    buildType(subProj_bt_367_5)
    buildType(subProj_bt_367_4)
    buildType(subProj_bt_367_1)
    buildType(subProj_bt_367_0)
    buildType(subProj_bt_367_3)
    buildType(subProj_bt_367_2)
})
