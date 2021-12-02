package subProj_891

import subProj_891.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_891")
    name = "subProj 891"

    buildType(subProj_bt_891_0)
    buildType(subProj_bt_891_1)
    buildType(subProj_bt_891_2)
    buildType(subProj_bt_891_3)
    buildType(subProj_bt_891_4)
    buildType(subProj_bt_891_5)
})
