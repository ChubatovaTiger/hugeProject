package subProj_383

import subProj_383.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_383")
    name = "subProj 383"

    buildType(subProj_bt_383_3)
    buildType(subProj_bt_383_2)
    buildType(subProj_bt_383_5)
    buildType(subProj_bt_383_4)
    buildType(subProj_bt_383_1)
    buildType(subProj_bt_383_0)
})
