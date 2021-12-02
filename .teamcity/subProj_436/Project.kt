package subProj_436

import subProj_436.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_436")
    name = "subProj 436"

    buildType(subProj_bt_436_0)
    buildType(subProj_bt_436_2)
    buildType(subProj_bt_436_1)
    buildType(subProj_bt_436_4)
    buildType(subProj_bt_436_3)
    buildType(subProj_bt_436_5)
})
