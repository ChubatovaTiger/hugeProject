package subProj_199

import subProj_199.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_199")
    name = "subProj 199"

    buildType(subProj_bt_199_1)
    buildType(subProj_bt_199_2)
    buildType(subProj_bt_199_0)
    buildType(subProj_bt_199_5)
    buildType(subProj_bt_199_3)
    buildType(subProj_bt_199_4)
})
