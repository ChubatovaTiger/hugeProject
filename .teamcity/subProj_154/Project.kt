package subProj_154

import subProj_154.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_154")
    name = "subProj 154"

    buildType(subProj_bt_154_0)
    buildType(subProj_bt_154_1)
    buildType(subProj_bt_154_2)
    buildType(subProj_bt_154_3)
    buildType(subProj_bt_154_4)
    buildType(subProj_bt_154_5)
})
