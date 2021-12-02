package subProj_418

import subProj_418.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_418")
    name = "subProj 418"

    buildType(subProj_bt_418_0)
    buildType(subProj_bt_418_1)
    buildType(subProj_bt_418_2)
    buildType(subProj_bt_418_3)
    buildType(subProj_bt_418_4)
    buildType(subProj_bt_418_5)
})
