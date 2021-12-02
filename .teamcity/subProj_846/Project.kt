package subProj_846

import subProj_846.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_846")
    name = "subProj 846"

    buildType(subProj_bt_846_4)
    buildType(subProj_bt_846_5)
    buildType(subProj_bt_846_2)
    buildType(subProj_bt_846_3)
    buildType(subProj_bt_846_0)
    buildType(subProj_bt_846_1)
})
