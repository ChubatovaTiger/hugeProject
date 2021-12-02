package subProj_1459

import subProj_1459.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1459")
    name = "subProj 1459"

    buildType(subProj_bt_1459_4)
    buildType(subProj_bt_1459_3)
    buildType(subProj_bt_1459_5)
    buildType(subProj_bt_1459_0)
    buildType(subProj_bt_1459_2)
    buildType(subProj_bt_1459_1)
})
