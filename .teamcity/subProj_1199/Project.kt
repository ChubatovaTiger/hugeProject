package subProj_1199

import subProj_1199.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1199")
    name = "subProj 1199"

    buildType(subProj_bt_1199_3)
    buildType(subProj_bt_1199_2)
    buildType(subProj_bt_1199_5)
    buildType(subProj_bt_1199_4)
    buildType(subProj_bt_1199_1)
    buildType(subProj_bt_1199_0)
})
