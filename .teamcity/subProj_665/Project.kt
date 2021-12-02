package subProj_665

import subProj_665.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_665")
    name = "subProj 665"

    buildType(subProj_bt_665_5)
    buildType(subProj_bt_665_4)
    buildType(subProj_bt_665_3)
    buildType(subProj_bt_665_2)
    buildType(subProj_bt_665_1)
    buildType(subProj_bt_665_0)
})
