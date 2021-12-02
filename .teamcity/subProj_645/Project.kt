package subProj_645

import subProj_645.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_645")
    name = "subProj 645"

    buildType(subProj_bt_645_5)
    buildType(subProj_bt_645_3)
    buildType(subProj_bt_645_4)
    buildType(subProj_bt_645_1)
    buildType(subProj_bt_645_2)
    buildType(subProj_bt_645_0)
})
