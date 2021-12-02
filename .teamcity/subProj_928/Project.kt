package subProj_928

import subProj_928.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_928")
    name = "subProj 928"

    buildType(subProj_bt_928_5)
    buildType(subProj_bt_928_4)
    buildType(subProj_bt_928_3)
    buildType(subProj_bt_928_2)
    buildType(subProj_bt_928_1)
    buildType(subProj_bt_928_0)
})
