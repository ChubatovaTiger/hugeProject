package subProj_589

import subProj_589.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_589")
    name = "subProj 589"

    buildType(subProj_bt_589_0)
    buildType(subProj_bt_589_1)
    buildType(subProj_bt_589_4)
    buildType(subProj_bt_589_5)
    buildType(subProj_bt_589_2)
    buildType(subProj_bt_589_3)
})
