package subProj_1402

import subProj_1402.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1402")
    name = "subProj 1402"

    buildType(subProj_bt_1402_5)
    buildType(subProj_bt_1402_0)
    buildType(subProj_bt_1402_4)
    buildType(subProj_bt_1402_3)
    buildType(subProj_bt_1402_2)
    buildType(subProj_bt_1402_1)
})
