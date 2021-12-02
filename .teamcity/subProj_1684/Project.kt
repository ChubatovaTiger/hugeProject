package subProj_1684

import subProj_1684.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1684")
    name = "subProj 1684"

    buildType(subProj_bt_1684_0)
    buildType(subProj_bt_1684_4)
    buildType(subProj_bt_1684_3)
    buildType(subProj_bt_1684_2)
    buildType(subProj_bt_1684_1)
    buildType(subProj_bt_1684_5)
})
