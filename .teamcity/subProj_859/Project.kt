package subProj_859

import subProj_859.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_859")
    name = "subProj 859"

    buildType(subProj_bt_859_3)
    buildType(subProj_bt_859_2)
    buildType(subProj_bt_859_1)
    buildType(subProj_bt_859_0)
    buildType(subProj_bt_859_5)
    buildType(subProj_bt_859_4)
})
