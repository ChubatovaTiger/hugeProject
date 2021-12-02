package subProj_25

import subProj_25.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_25")
    name = "subProj 25"

    buildType(subProj_bt_25_0)
    buildType(subProj_bt_25_1)
    buildType(subProj_bt_25_2)
    buildType(subProj_bt_25_3)
    buildType(subProj_bt_25_4)
    buildType(subProj_bt_25_5)
})
