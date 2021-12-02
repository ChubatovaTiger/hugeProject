package subProj_839

import subProj_839.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_839")
    name = "subProj 839"

    buildType(subProj_bt_839_0)
    buildType(subProj_bt_839_1)
    buildType(subProj_bt_839_4)
    buildType(subProj_bt_839_5)
    buildType(subProj_bt_839_2)
    buildType(subProj_bt_839_3)
})
