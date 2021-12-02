package subProj_1127

import subProj_1127.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1127")
    name = "subProj 1127"

    buildType(subProj_bt_1127_0)
    buildType(subProj_bt_1127_2)
    buildType(subProj_bt_1127_1)
    buildType(subProj_bt_1127_4)
    buildType(subProj_bt_1127_3)
    buildType(subProj_bt_1127_5)
})
