package subProj_684

import subProj_684.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_684")
    name = "subProj 684"

    buildType(subProj_bt_684_2)
    buildType(subProj_bt_684_3)
    buildType(subProj_bt_684_4)
    buildType(subProj_bt_684_5)
    buildType(subProj_bt_684_0)
    buildType(subProj_bt_684_1)
})
