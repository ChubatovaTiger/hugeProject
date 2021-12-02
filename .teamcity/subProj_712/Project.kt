package subProj_712

import subProj_712.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_712")
    name = "subProj 712"

    buildType(subProj_bt_712_5)
    buildType(subProj_bt_712_4)
    buildType(subProj_bt_712_3)
    buildType(subProj_bt_712_2)
    buildType(subProj_bt_712_1)
    buildType(subProj_bt_712_0)
})
