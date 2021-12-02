package subProj_555

import subProj_555.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_555")
    name = "subProj 555"

    buildType(subProj_bt_555_0)
    buildType(subProj_bt_555_1)
    buildType(subProj_bt_555_2)
    buildType(subProj_bt_555_3)
    buildType(subProj_bt_555_4)
    buildType(subProj_bt_555_5)
})
