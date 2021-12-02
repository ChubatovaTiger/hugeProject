package subProj_651

import subProj_651.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_651")
    name = "subProj 651"

    buildType(subProj_bt_651_0)
    buildType(subProj_bt_651_1)
    buildType(subProj_bt_651_4)
    buildType(subProj_bt_651_5)
    buildType(subProj_bt_651_2)
    buildType(subProj_bt_651_3)
})
